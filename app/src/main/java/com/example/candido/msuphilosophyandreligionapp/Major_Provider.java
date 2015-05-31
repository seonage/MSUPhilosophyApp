package com.example.candido.msuphilosophyandreligionapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Candido on 4/29/2015.
 */
public class Major_Provider {

    public static HashMap<String, List<String>> getInfo(){

        HashMap<String, List<String>> Major_Details = new HashMap<String, List<String>>();
        List<String> Core = new ArrayList<>();
        Core.add("PHIL     106     Logic (3 hours lecture)");
        Core.add("PHIL     310     Knowledge, Belief and Truth (3 hours lecture)");
        Core.add("PHIL     312     Existence and Reality (3 hours lecture)");
        Core.add("PHIL     331     History of Philosophy: Ancient Philosophy (3 hours lecture)");
        Core.add("PHIL     333     History of Philosophy: Modern Philosophy (3 hours lecture)");

        List<String> Value_Theory = new ArrayList<>();
        Value_Theory.add("PHIL     200     History of Ethics (3 hours lecture)");
        Value_Theory.add("PHIL     212     Social and Political Philosophy (3 hours lecture)");

        List<String> Traditions_In_Contemporary_Philosophy = new ArrayList<>();
        Traditions_In_Contemporary_Philosophy.add("PHIL     231     American Philosophy (3 hours lecture)");
        Traditions_In_Contemporary_Philosophy.add("PHIL     337     Analytic Philosophy (3 hours lecture)");
        Traditions_In_Contemporary_Philosophy.add("PHIL     339     Contemporary Continental Philosophy (3 hours lecture)");

        List<String> Seminar = new ArrayList<>();
        Seminar.add("PHIL     424     Seminar in Philosophy (3 hours lecture)");

        List<String> Major_Electives = new ArrayList<>();
        Major_Electives.add("PHIL     100     Introduction to Philosophy (3 hours lecture)");
        Major_Electives.add("PHIL     102     Ethics (3 hours lecture)");
        Major_Electives.add("PHIL     200     History of Ethics (3 hours lecture)");
        Major_Electives.add("PHIL     202     Ethics and Business (3 hours lecture)");
        Major_Electives.add("PHIL     204     Philosophical Issues in Biomedical Ethics (3 hours lecture)");
        Major_Electives.add("PHIL     206     Philosophical Issues in Law and Justice (3 hours lecture)");
        Major_Electives.add("PHIL     208     Ethical Issues in Education (3 hours lecture)");
        Major_Electives.add("PHIL     212     Social and Political Philosophy (3 hours lecture)");
        Major_Electives.add("PHIL     214     Ethics of Love, Sex and Desire (3 hours lecture)");
        Major_Electives.add("PHIL     231     American Philosophy (3 hours lecture)");
        Major_Electives.add("PHIL     233     Contemporary Philosophers (3 hours lecture)");
        Major_Electives.add("PHIL     237     Asian Philosophy (3 hours lecture)");
        Major_Electives.add("PHIL     239     Existentialism (3 hours lecture)");
        Major_Electives.add("PHIL     260     Philosophies of Art (3 hours lecture)");
        Major_Electives.add("PHIL     262     Philosophy of Religion (3 hours lecture)");
        Major_Electives.add("PHIL     264     Critical Reasoning and Arguments (3 hours lecture)");
        Major_Electives.add("PHIL     266     Philosophy of Science (3 hours lecture)");
        Major_Electives.add("PHIL     270     Philosophy of Mind (3 hours lecture)");
        Major_Electives.add("PHIL     271     Philosophy of Sport (3 hours lecture)");
        Major_Electives.add("PHIL     280     Philosophy of Cyberspace (3 hours lecture)");
        Major_Electives.add("PHIL     288     Introduction to Cognitive Science (3 hours lecture)");
        Major_Electives.add("PHIL     290     Fields of Philosophy: Selected Topic (3 hours lecture)");
        Major_Electives.add("PHIL     295     Periods and Movements: Selected Topics (3 hours lecture)");
        Major_Electives.add("PHIL     316     Philosophy of Law (3 hours lecture)");
        Major_Electives.add("PHIL     322     Ideals of Peace (3 hours lecture)");
        Major_Electives.add("PHIL     324     Legal Reasoning (3 hours lecture)");
        Major_Electives.add("PHIL     330     Philosophy and Death (3 hours lecture)");
        Major_Electives.add("PHIL     334     Theoretical and Applied Ethics (3 hours lecture)");
        Major_Electives.add("PHIL     335     Nineteenth Century Philosophy (3 hours lecture)");
        Major_Electives.add("PHIL     337     Analytic Philosophy (3 hours lecture)");
        Major_Electives.add("PHIL     339     Contemporary Continental Philosophy (3 hours lecture)");
        Major_Electives.add("PHIL     376     Feminist Jurisprudence (3 hours lecture)");
        Major_Electives.add("PHIL     390     Fields of Philosophy: Selected Topics (3 hours lecture)");
        Major_Electives.add("PHIL     395     Periods and Movements: Selected Topics (3 hours lecture)");
        Major_Electives.add("PHIL     446     Independent Study in Philosophy (3 hours lecture)");

        Major_Details.put("CORE",Core);
        Major_Details.put("VALUE THEORY",Value_Theory);
        Major_Details.put("TRADITIONS IN CONTEMPORARY PHILOSOPHY",Traditions_In_Contemporary_Philosophy);
        Major_Details.put("SEMINAR",Seminar);
        Major_Details.put("MAJOR ELECTIVES",Major_Electives);

        return Major_Details;

    }
}
