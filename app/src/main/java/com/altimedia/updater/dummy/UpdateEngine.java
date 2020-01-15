package com.altimedia.updater.dummy;


public class UpdateEngine {

    public static final class ErrorCodeConstants {
        /**
         * Error code: a request finished successfully.
         */
        public static final int SUCCESS = 0;
        /**
         * Error code: a request failed due to a generic error.
         */
        public static final int ERROR = 1;
        /**
         * Error code: an update failed to apply due to filesystem copier
         * error.
         */
        public static final int FILESYSTEM_COPIER_ERROR = 4;
        /**
         * Error code: an update failed to apply due to an error in running
         * post-install hooks.
         */
        public static final int POST_INSTALL_RUNNER_ERROR = 5;
        /**
         * Error code: an update failed to apply due to a mismatching payload.
         *
         * <p>For example, the given payload uses a feature that's not
         * supported by the current update engine.
         */
        public static final int PAYLOAD_MISMATCHED_TYPE_ERROR = 6;
        /**
         * Error code: an update failed to apply due to an error in opening
         * devices.
         */
        public static final int INSTALL_DEVICE_OPEN_ERROR = 7;
        /**
         * Error code: an update failed to apply due to an error in opening
         * kernel device.
         */
        public static final int KERNEL_DEVICE_OPEN_ERROR = 8;
        /**
         * Error code: an update failed to apply due to an error in fetching
         * the payload.
         *
         * <p>For example, this could be a result of bad network connection
         * when streaming an update.
         */
        public static final int DOWNLOAD_TRANSFER_ERROR = 9;
        /**
         * Error code: an update failed to apply due to a mismatch in payload
         * hash.
         *
         * <p>Update engine does sanity checks for the given payload and its
         * metadata.
         */
        public static final int PAYLOAD_HASH_MISMATCH_ERROR = 10;
        /**
         * Error code: an update failed to apply due to a mismatch in payload
         * size.
         */
        public static final int PAYLOAD_SIZE_MISMATCH_ERROR = 11;
        /**
         * Error code: an update failed to apply due to failing to verify
         * payload signatures.
         */
        public static final int DOWNLOAD_PAYLOAD_VERIFICATION_ERROR = 12;
        /**
         * Error code: an update failed to apply due to a downgrade in payload
         * timestamp.
         *
         * <p>The timestamp of a build is encoded into the payload, which will
         * be enforced during install to prevent downgrading a device.
         */
        public static final int PAYLOAD_TIMESTAMP_ERROR = 51;
        /**
         * Error code: an update has been applied successfully but the new slot
         * hasn't been set to active.
         *
         * <p>It indicates a successful finish of calling {@link #applyPayload} with
         * {@code SWITCH_SLOT_ON_REBOOT=0}. See {@link #applyPayload}.
         */
        public static final int UPDATED_BUT_NOT_ACTIVE = 52;
    }
    /**
     * Status codes for update engine. Values must agree with the ones in
     * {@code system/update_engine/client_library/include/update_engine/update_status.h}.
     */
    public static final class UpdateStatusConstants {
        /**
         * Update status code: update engine is in idle state.
         */
        public static final int IDLE = 0;
        /**
         * Update status code: update engine is checking for update.
         */
        public static final int CHECKING_FOR_UPDATE = 1;
        /**
         * Update status code: an update is available.
         */
        public static final int UPDATE_AVAILABLE = 2;
        /**
         * Update status code: update engine is downloading an update.
         */
        public static final int DOWNLOADING = 3;
        /**
         * Update status code: update engine is verifying an update.
         */
        public static final int VERIFYING = 4;
        /**
         * Update status code: update engine is finalizing an update.
         */
        public static final int FINALIZING = 5;
        /**
         * Update status code: an update has been applied and is pending for
         * reboot.
         */
        public static final int UPDATED_NEED_REBOOT = 6;
        /**
         * Update status code: update engine is reporting an error event.
         */
        public static final int REPORTING_ERROR_EVENT = 7;
        /**
         * Update status code: update engine is attempting to rollback an
         * update.
         */
        public static final int ATTEMPTING_ROLLBACK = 8;
        /**
         * Update status code: update engine is in disabled state.
         */
        public static final int DISABLED = 9;
    }


    public boolean bind(final UpdateEngineCallback callback) {
        return true;
    }

    public boolean unbind() {
        return true;
    }

    public void applyPayload(String url, long offset, long size, String[] headerKeyValuePairs) {
    }

    public void cancel() {

    }

    public void resetStatus() {

    }

    public boolean verifyPayloadMetadata(String payloadMetadataFilename) {
        return true;
    }
}
