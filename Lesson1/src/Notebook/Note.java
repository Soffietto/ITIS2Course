package Notebook;

public class Note {
    String name;
    String surname;
    String middlename;
    String note;

    Note(String name, String surname, String middlename){
        this.name = name;
        this.surname = surname;
        this.middlename= middlename;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
}

