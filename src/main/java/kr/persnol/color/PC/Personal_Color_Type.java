package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
public class Personal_Color_Type {
    public static final Personal_Color_Type SUMMER = ;
    @Id
    @Column(name = "sw")
    private String springwarm;

    @Column(name = "sc")
    private String summercool;

    @Column(name = "aw")
    private String autumnwarm;

    @Column(name = "wc")
    private String winttercool;
}