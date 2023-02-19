package CPRchecker;

public class isValid {
    // over eller under 10
        if(cpr.length()!=11)

    int firstTwoDigits = Integer.parseInt(cpr.substring(0, 2));
        if(firstTwoDigits >31)

    { //else
        return false;
    }

    int middleTwoDigits = Integer.parseInt(cpr.substring(4, 6));
        if(middleTwoDigits >12)

    { //else
        return false;
    }

        return true; //hvis alle krav opfyldes
}
}
