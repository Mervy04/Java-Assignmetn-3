package com.company;

public final class ProjectConstants {

    // ---------*---------*---------*---------*---------*
    // String Constants
    public static final String SECTION_DIV = "\n=================================================================================";
    public static final String DATA_DIV = "\n=========================================";

    // Data
    public static final String TYPE_ERR = "\n\tERROR DATA TYPE MISMATCH: ";
    public static final String EXPECTED_INT = "Integer data expected.";
    public static final String EXPECTED_DBL = "Double precision data expected.";
    public static final String EXPECTED_BOOL = "Boolean data expected.";

    // ---------*---------*---------*---------*---------*
    // Integer Constants

    public static final int INVALID = -1;
    public static final int MAXTASKS = 0;
    public static final int MAXCOLUMNS = 0;
    public static final int TASK = 0;
    public static final int TOPT = 1;
    public static final int TPLESS = 2;
    public static final int TML = 3;
    public static final int TPRED1 = 4;
    public static final int TPRED2 = 5;
    public static final int TPRED3 = 6;
    public static final int TSUCC1 = 7;
    public static final int TSUCC2 = 8;
    public static final int TSUCC3 = 9;
    public static final int TEXPECT = 10;
    public static final int TESTART = 11;
    public static final int TEFIN = 12;
    public static final int TLSTART = 13;
    public static final int TLFIN = 14;
    public static final int TSLACK = 15;



    // ---------*---------*---------*---------*---------*
    // Boolean Constants

    public static final boolean DBG = false;

    // PRIVATE //

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The caller references the constants using ProjectConstants.MAXDATA, or as MAXDATA.
    // We prevent the caller should be prevented from constructing objects of
    // this class, by declaring this private constructor.
    //
    protected ProjectConstants() {
        //this prevents even the native class from calling this constructor as well
        throw new AssertionError();
    }


}
