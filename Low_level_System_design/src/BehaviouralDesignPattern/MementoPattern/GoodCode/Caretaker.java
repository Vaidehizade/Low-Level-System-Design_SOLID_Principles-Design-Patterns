package BehaviouralDesignPattern.MementoPattern.GoodCode;

import java.util.Stack;

//Caretaker class: manages mementos (snapshots of the textEditor state)
public class Caretaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());
    }
     public void undo(TextEditor editor){
        if(!history.empty()){
            editor.restore(history.pop());
            //last saved state of history and give it to editor
        }
     }

}
