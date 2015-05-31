package com.example.candido.msuphilosophyandreligionapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Candido on 5/7/2015.
 */
public class Minor_Religion_Provider {

    public static HashMap<String, List<String>> getInfo(){
        HashMap<String, List<String>> Minor_Religion_Details = new HashMap<>();

        List<String> Complete_1_Course = new ArrayList<>();
        Complete_1_Course.add("RELG\t100     Religions of the World (3 hours lecture)");
        Complete_1_Course.add("RELG\t101     Introduction to Religion (3 hours lecture)");

        List<String> Complete_1_Course2 = new ArrayList<>();
        Complete_1_Course2.add("RELG\t460     Seminar in World Religions (3 hours seminar)");
        Complete_1_Course2.add("RELG\t462     Seminar in Religious Texts (3 hours seminar)");
        Complete_1_Course2.add("RELG\t465     Seminar in Religion and Culture (3 hours seminar)");
        Complete_1_Course2.add("RELG\t467     Seminar in Religious Issues (3 hours seminar)");

        List<String> Complete_12_Semester = new ArrayList<>();
        Complete_12_Semester.add("RELG\t100     Religions of the World (3 hours lecture)");
        Complete_12_Semester.add("RELG\t101     Introduction to Religion (3 hours lecture)");
        Complete_12_Semester.add("RELG\t200     Old Testament: Genesis to Joshua (3 hours lecture)");
        Complete_12_Semester.add("RELG\t202     Old Testament: Joshua to Daniel (3 hours lecture)");
        Complete_12_Semester.add("RELG\t204     New Testament: Jesus and the Gospels (3 hours lecture)");
        Complete_12_Semester.add("RELG\t205     Religion and Ethical Issues (3 hours lecture)");
        Complete_12_Semester.add("RELG\t206     New Testament: Paul and the Early Church (3 hours lecture)");
        Complete_12_Semester.add("RELG\t207     Religious Texts in America: Women (3 hours lecture)");
        Complete_12_Semester.add("RELG\t213     Buddhism (3 hours lecture)");
        Complete_12_Semester.add("RELG\t214     Classical Texts of Asian Religions (3 hours lecture)");
        Complete_12_Semester.add("RELG\t215     Hinduism (3 hours lecture)");
        Complete_12_Semester.add("RELG\t217     Taoism (3 hours lecture)");
        Complete_12_Semester.add("RELG\t218     Death, Dying and Afterlife (3 hours lecture)");
        Complete_12_Semester.add("RELG\t221     Religion and Culture (3 hours lecture)");
        Complete_12_Semester.add("RELG\t223     Religion in North America (3 hours lecture)");
        Complete_12_Semester.add("RELG\t225     Religion and Social Change (3 hours lecture)");
        Complete_12_Semester.add("RELG\t240     Asian Religions (3 hours lecture)");
        Complete_12_Semester.add("RELG\t246     Islamic Religious Traditions (3 hours lecture)");
        Complete_12_Semester.add("RELG\t250     African Religions (3 hours lecture)");
        Complete_12_Semester.add("RELG\t252     African-American Religion (3 hours lecture)");
        Complete_12_Semester.add("RELG\t254     Native American Religion (3 hours lecture)");
        Complete_12_Semester.add("RELG\t256     Religion in Latin America (3 hours lecture)");
        Complete_12_Semester.add("RELG\t258     Christian History and Thought (3 hours lecture)");
        Complete_12_Semester.add("RELG\t262     Philosophy of Religion (3 hours lecture)");
        Complete_12_Semester.add("RELG\t263     Religion and Psychology (3 hours lecture))");
        Complete_12_Semester.add("RELG\t267     Women and Religion (3 hours lecture)");
        Complete_12_Semester.add("RELG\t273     The Holocaust: Religious Perspectives (3 hours lecture)");
        Complete_12_Semester.add("RELG\t300     Classics of Western Religious Thought (3 hours lecture)");
        Complete_12_Semester.add("RELG\t301     Jewish Spirituality and Mysticism (3 hours lecture)");
        Complete_12_Semester.add("RELG\t304     Feminist Theology and Spirituality (3 hours lecture)");
        Complete_12_Semester.add("RELG\t326     Theology (3 hours lecture)");
        Complete_12_Semester.add("RELG\t332     Myth, Meaning and Self (3 hours lecture)");
        Complete_12_Semester.add("RELG\t350     Selected Study in World Religions (3 hours lecture)");
        Complete_12_Semester.add("RELG\t352     Selected Study in Religious Texts (3 hours lecture)");
        Complete_12_Semester.add("RELG\t355     Selected Study in Religion and Culture (3 hours lecture)");
        Complete_12_Semester.add("RELG\t357     Selected Study in Religious Issues (3 hours lecture)");
        Complete_12_Semester.add("RELG\t460     Seminar in World Religions (3 hours seminar)");
        Complete_12_Semester.add("RELG\t462     Seminar in Religious Texts (3 hours seminar)");
        Complete_12_Semester.add("RELG\t465     Seminar in Religion and Culture (3 hours seminar)");
        Complete_12_Semester.add("RELG\t467     Seminar in Religious Issues (3 hours seminar)");

        Minor_Religion_Details.put("Complete 1 course from the following:",Complete_1_Course);
        Minor_Religion_Details.put("Complete 1 course from the following: ",Complete_1_Course2);
        Minor_Religion_Details.put("Complete 12 semester hours from the following:",Complete_12_Semester);

        return Minor_Religion_Details;

    }
}
