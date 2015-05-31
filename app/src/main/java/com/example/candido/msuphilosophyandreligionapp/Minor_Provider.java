package com.example.candido.msuphilosophyandreligionapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Candido on 4/30/2015.
 */
public class Minor_Provider {

    public static HashMap<String, List<String>> getInfo(){
        HashMap<String, List<String>> Minor_Details = new HashMap<String, List<String>>();

        List<String> Philosophy_Selective_Courses_Even = new ArrayList<>();
        Philosophy_Selective_Courses_Even.add("PHIL\t100     Introduction to Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t102     Ethics (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t106     Logic (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t202     Ethics and Business (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t204     Philosophical Issues in Biomedical Ethics (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t206     Philosophical Issues in Law and Justice (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t208     Ethical Issues in Education (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t212     Social and Political Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t260     Philosophies of Art (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t262     Philosophy of Religion (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t264     Critical Reasoning and Arguments (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t266     Philosophy of Science (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t290     Fields of Philosophy: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t292     Fields of Philosophy: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t310     Knowledge, Belief and Truth (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t312     Existence and Reality (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t316     Philosophy of Law (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t324     Legal Reasoning (3 hours lecture))");
        Philosophy_Selective_Courses_Even.add("PHIL\t390     Fields of Philosophy: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Even.add("PHIL\t424     Seminar in Philosophy (3 hours seminar)");
        Philosophy_Selective_Courses_Even.add("PHIL\t426     Seminar in Philosophy (3 hours seminar)");
        Philosophy_Selective_Courses_Even.add("PHIL\t444     Independent Study in Philosophy (3 credits)");
        Philosophy_Selective_Courses_Even.add("PHIL\t446     Independent Study in Philosophy (3\u002D12 credits)");

        List<String> Philosophy_Selective_Courses_Odd = new ArrayList<>();
        Philosophy_Selective_Courses_Odd.add("PHIL\t231     American Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t233     Contemporary Philosophers (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t237     Asian Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t239     Existentialism (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t291     Fields of Philosophy: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t293     Fields of Philosophy: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t295     Periods and Movements: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t297     Periods and Movements: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t331     History of Philosophy: Ancient Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t333     History of Philosophy: Modern Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t335     Nineteenth Century Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t337     Analytic Philosophy (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t395     Periods and Movements: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t397     Periods and Movements: Selected Topics (3 hours lecture)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t447     Independent Study in Philosophy (3\u002D12 credits)");
        Philosophy_Selective_Courses_Odd.add("PHIL\t449     Independent Study in Philosophy (3\u002D12 credits)");

        Minor_Details.put("PHILOSOPHY SELECTIVE COURSES - ODD",Philosophy_Selective_Courses_Odd);
        Minor_Details.put("PHILOSOPHY SELECTIVE COURSES - EVEN",Philosophy_Selective_Courses_Even);


        return Minor_Details;

    }
}
