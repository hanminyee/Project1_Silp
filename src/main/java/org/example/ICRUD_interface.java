package org.example;

public interface ICRUD_interface {
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void select(int id);
}
