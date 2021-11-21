package Lesson6.VideoLesson;

interface teamMain {
    void punch();
}

interface teamEdit {
    void edit();
}

class Player implements teamEdit, teamMain {

    @Override
    public void punch() {

    }

    @Override
    public void edit() {

    }
}