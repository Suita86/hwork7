// Класс, реализующий представление записной книжки

import java.util.List;

class NotesActivity implements NotesView {
    private NotesPresenter presenter;

    public NotesActivity() {
        presenter = new NotesPresenterImpl(this);
    }

    public void showNotes() {
        presenter.loadNotes();
    }

    public void addNote(String name, String phone) {
        presenter.addNote(name, phone);
    }

    public void deleteNote(Note note) {
        presenter.deleteNote(note);
    }

    @Override
    public void displayNotes(List<Note> notes) {
        for (Note note : notes) {
            System.out.println("Name: " + note.getName() + ", Phone: " + note.getPhone());
        }
    }

    @Override
    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}
