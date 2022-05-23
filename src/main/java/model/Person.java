package model;

import com.google.gson.annotations.SerializedName;

public class Person {

    @SerializedName("my_id")
    int myId;
    @SerializedName("my-name")
    String myName;
    int myAge;
    @SerializedName("my_dept")
    String myDept;

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyDept() {
        return myDept;
    }

    public void setMyDept(String myDept) {
        this.myDept = myDept;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myId=" + myId +
                ", myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", myDept='" + myDept + '\'' +
                '}';
    }
}
