package com.northeastern.edu.simpledb.common;

public class Error {

    // common
    public static final Exception FileNotExistsException = new RuntimeException("File does not exists!");
    public static final Exception FileCannotRWException = new RuntimeException("File cannot read or write!");

    public static final Exception CacheFullException = new RuntimeException("Cache is full!");


    // dm
    public static final Exception MemTooSmallException = new RuntimeException("Memory too small!");

    // tm
    public static final Exception BadXIDFileException = new RuntimeException("Bad XID file!");

}
