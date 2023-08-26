// Пример использования
public class Main {
    public static void main(String[] args) {
        NotesActivity notesActivity = new NotesActivity();

        // Добавление записей
        notesActivity.addNote("Andrei", "89254569823");
        notesActivity.addNote("Maksim", "89037542091");

        // Просмотр записей
        notesActivity.showNotes();

        // Удаление записи
        Note note = new Note("Andrei", "89254569823");
        notesActivity.deleteNote(note);
    }
}