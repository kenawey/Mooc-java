
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class Pipe<T> {

    private List<T> pipeList;

    public Pipe() {
        pipeList = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipeList.add(value);
        Collections.sort((List) pipeList);
    }

    public T takeFromPipe() {
        T t = null;
        t = pipeList.get(0);
        pipeList.remove(t);
        Collections.sort((List) pipeList);
        return t;
    }

    public boolean isInPipe() {
        return !pipeList.isEmpty();
    }
}
