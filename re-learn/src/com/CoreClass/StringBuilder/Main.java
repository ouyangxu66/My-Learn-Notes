package com.CoreClass.StringBuilder;

public class Main {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ").append(table).append(" (");
        for (int i = 0; i < fields.length-1; i++) {
            sb.append(fields[i]).append(", ");
        }
        sb.append(fields[fields.length-1]);
        sb.append(") VALUES(?, ?, ?)");

        return sb.toString();
    }
}
