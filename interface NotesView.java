// Интерфейс для взаимодействия с записной книжкой

import java.util.List;

interface NotesView {
    void displayNotes(List<Note> notes);

    void displayError(String message);
}
