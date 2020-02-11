package com.codewithmosh.mediator;

public class ArticlesDialogBox {
    private ListBox articleListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        articleListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void articleSelected() {
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
