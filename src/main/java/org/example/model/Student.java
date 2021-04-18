package org.example.model;

public class Student {

    private String name;
    private String role;
    private String group;
    private String groupNumber;

    public void setName(String inName){
        name = inName;
    }

    public void setRole(String inRole){
        role = inRole;
    }
    public void setGroup (String inGroup){
        group = inGroup;
    }
    public void setGroupNumber (String inGroupNumber){
        groupNumber = inGroupNumber;
    }

    public String getInfo(){
        return name + " is a " + role + "in " + group + "and belongs to the G " + groupNumber;
    }


    public void setGroupNumber(int groupNumber) {
    }
}