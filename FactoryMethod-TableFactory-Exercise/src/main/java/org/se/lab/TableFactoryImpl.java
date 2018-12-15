package org.se.lab;

public class TableFactoryImpl implements TableFactory {

    public PersonTable createPersonTable(){
        return new PersonTableImpl();
    }
}
