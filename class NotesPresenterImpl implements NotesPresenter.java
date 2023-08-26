// Класс, реализующий презентер

import java.util.ArrayList;
import java.util.List;

class NotesPresenterImpl implements NotesPresenter {
    private NotesView view;
    private List<Note> notes;

    public NotesPresenterImpl(NotesView view) {
        this.view = view;
        notes = new ArrayList<>();
    }

    @Override
    public void loadNotes() {
        view.displayNotes(notes);
    }

    @Override
    public void addNote(String name, String phone) {
        Note note = new Note(name, phone);
        notes.add(note);
        view.displayNotes(notes);
    }

    @Override
    public void deleteNote(Note note) {
        notes.remove(note);
        view.displayNotes(notes);
    }
}