package com.altimedia.updater.dummy;


public abstract class UpdateEngineCallback {
    public abstract void onStatusUpdate(int status, float percent);
    public abstract void onPayloadApplicationComplete(int errorCode);
}
