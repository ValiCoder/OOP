//Implement the Updatable interface in the Screen class.
//Requirements:
//• The Updatable interface must inherit (extends) the Selectable interface.
//• The Screen class must implement (implements) the Updatable interface.
//• The onSelect method of the Selectable interface must be implemented in
//the Screen class.
//• The refresh method of the Updatable interface must be implemented in the
//Screen class.

package Assignment_3_1;

public class Task_15 {
    public static void main(String[] args) throws Exception {
    }
    interface Selectable {
        void onSelect();
    }
    interface Updatable extends Selectable {
        void refresh();
    }
    class Screen implements Updatable {
        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }
}
