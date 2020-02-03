package com.codewithmosh.template;

public abstract class Task {
    private AuditTrail auditTrailer;

    public Task() {
        auditTrailer = new AuditTrail();
    }

    public Task(AuditTrail auditTrailer) {
        this.auditTrailer = auditTrailer;
    }

    public void execute() {
        auditTrailer.record();
        doExecute();
    }

    protected abstract void doExecute();
}
