package com.ht.bean;

public class Print {
    /**
    * 主键，标识列，自动生成
    */
    private Integer printid;

    /**
    * //状态  1:ON打开 2：OFF关闭
    */
    private Integer state;

    public Integer getPrintid() {
        return printid;
    }

    public void setPrintid(Integer printid) {
        this.printid = printid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", printid=").append(printid);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}