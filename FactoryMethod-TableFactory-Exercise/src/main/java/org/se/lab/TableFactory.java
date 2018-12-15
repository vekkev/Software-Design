package org.se.lab;

public interface TableFactory {

    TableFactory INSTANCE = new TableFactoryImpl();

    PersonTable createPersonTable();
}
