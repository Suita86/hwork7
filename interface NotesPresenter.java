// Интерфейс презентера для обработки действий пользователя
interface NotesPresenter {
    void loadNotes();

    void addNote(String name, String phone);

    void deleteNote(Note note);
}