package model;

public class Issue implements Comparable<Issue> {

    // TODO: declare fields
    private String description;
    private int urgencyLevel; // 1 = most urgent

    // TODO: create constructor
    public Issue(String description, int urgencyLevel){
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    // TODO: implement compareTo()
    @Override
    public int compareTo(Issue other) {
        // TODO: implement priority logic
        return this.urgencyLevel-other.urgencyLevel;
    }

    // TODO: override toString()
    public String toString(){
        return "description" + this.description + "\n urgencyLevel" + this.urgencyLevel;
    }
}
