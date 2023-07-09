package Homeworks.HW2.BuilderPattern;

public class AndroidExample {
    static class AlertDialog {
        final private String title;
        final private String message;
        private final String icon;
        private final boolean cancelable;

        public AlertDialog(String title, String message, String icon, boolean cancelable) {
            this.title = title;
            this.message = message;
            this.icon = icon;
            this.cancelable = cancelable;
        }

        public String getTitle() {
            return title;
        }

        public String getMessage() {
            return message;
        }

        public String getIcon() {
            return icon;
        }

        public boolean isCancelable() {
            return cancelable;
        }

        @Override
        public String toString() {
            return "AlertDialog{" +
                    "title='" + title + '\'' +
                    ", message='" + message + '\'' +
                    ", icon='" + icon + '\'' +
                    ", cancelable=" + cancelable +
                    '}';
        }

        public void show() {
            System.out.println(this);
        }

        static class Builder {
            private String title;
            private String message;
            private String icon;
            private boolean cancelable = true;

            public Builder(Object o) {

            }

            public AlertDialog create() {
                return new AlertDialog(title, message, icon, cancelable);
            }

            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }

            public Builder setMessage(String message) {
                this.message = message;
                return this;
            }

            public Builder setIcon(String icon) {
                this.icon = icon;
                return this;
            }

            public Builder setCancelable(boolean cancelable) {
                this.cancelable = cancelable;
                return this;
            }
        }
    }

    public static void main(String[] args) {
        AlertDialog alertDialog = new AlertDialog.Builder(null)
                .setTitle("New Title")
                .setMessage("Паттерн Builder")
                .setIcon("super icon")
                .setCancelable(false)
                .create();

        alertDialog.show();
    }
}
