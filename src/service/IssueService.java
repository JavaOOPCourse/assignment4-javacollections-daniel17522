package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Missing grade submission", 2));
        issues.add(new Issue("Scholarship deadline missed", 1));
        issues.add(new Issue("Course registration error", 3));
        issues.add(new Issue("Library fine overdue", 5));
        issues.add(new Issue("Thesis submission delay", 4));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        Issue top = issues.peek();
        if (top != null) {
            System.out.println("Most urgent issue: " + top);
        } else {
            System.out.println("No issues in the queue.");
        }
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        for (int i = 0; i < 2; i++) {
            Issue resolved = issues.poll();
            if (resolved != null) {
                System.out.println("Resolved issue: " + resolved);
            } else {
                System.out.println("No more issues to resolve.");
            }
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        System.out.println("=== Remaining Issues ===");
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("--------------------");
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
        System.out.println("New issue added: " + description + " (urgency: " + urgency + ")");
    }
}
