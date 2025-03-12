package com.sergio;

public class Badge {

    public String print(Integer id, String name, String department) {
        StringBuilder sb = new StringBuilder();

        if(id != null && name !=null && department != null) {
            sb.append(String.format("[%s]", id))
                    .append(String.format(" - %s", name))
                    .append(String.format(" - %s", department.toUpperCase()));

            return sb.toString();
        } else if (id == null) {
            sb.append(String.format("%s", name))
                    .append(String.format(" - %s", department.toUpperCase()));

            return sb.toString();
        } else if(id == null && department == null){
            sb.append(String.format("%s", name))
                    .append(" - OWNER");

            return sb.toString();
        }
        return "";
    }


}
