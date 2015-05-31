package com.example.candido.msuphilosophyandreligionapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Candido on 5/7/2015.
 */
public class Major_Religion_Provider {

    public static HashMap<String, List<String>> getInfo(){
        HashMap<String, List<String>> Major_Religion_Details = new HashMap<String, List<String>>();
        List<String> TEXTS = new ArrayList<>();
        TEXTS.add("RELG\t200     Old Testament: Genesis to Joshua (3 hours lecture)");
        TEXTS.add("RELG\t202     Old Testament: Joshua to Daniel (3 hours lecture)");
        TEXTS.add("RELG\t204     New Testament: Jesus and the Gospels (3 hours lecture)");
        TEXTS.add("RELG\t206     New Testament: Paul and the Early Church (3 hours lecture)");
        TEXTS.add("RELG\t214     Classical Texts of Asian Religions (3 hours lecture)");
        TEXTS.add("RELG\t300     Classics of Western Religious Thought (3 hours lecture)");
        TEXTS.add("RELG\t352     Selected Study in Religious Texts (3 hours lecture)");

        List<String> ISSUES = new ArrayList<>();
        ISSUES.add("RELG\t205     Religion and Ethical Issues (3 hours lecture)");
        ISSUES.add("RELG\t218     Death, Dying and Afterlife (3 hours lecture)");
        ISSUES.add("RELG\t225     Religion and Social Change (3 hours lecture)");
        ISSUES.add("RELG\t273     The Holocaust: Religious Perspectives (3 hours lecture)");
        ISSUES.add("RELG\t304     Feminist Theology and Spirituality (3 hours lecture)");
        ISSUES.add("RELG\t322     Ideals of Peace (3 hours lecture)");
        ISSUES.add("RELG\t332     Myth, Meaning and Self (3 hours lecture)");
        ISSUES.add("RELG\t357     Selected Study in Religious Issues (3 hours lecture)");

        List<String> APPROACHES = new ArrayList<>();
        APPROACHES.add("RELG\t101     Introduction to Religion (3 hours lecture)");
        APPROACHES.add("RELG\t221     Religion and Culture (3 hours lecture)");
        APPROACHES.add("RELG\t262     Philosophy of Religion (3 hours lecture)");
        APPROACHES.add("RELG\t263     Religion and Psychology (3 hours lecture)");
        APPROACHES.add("RELG\t267     Women and Religion (3 hours lecture)");
        APPROACHES.add("RELG\t320     Religious Ethical Thinkers (3 hours lecture)");
        APPROACHES.add("RELG\t326     Theology (3 hours lecture)");
        APPROACHES.add("RELG\t355     Selected Study in Religion and Culture (3 hours lecture)");

        List<String> GLOBAL_RELIGIOUS_TRADITIONS = new ArrayList<>();
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t100     Religions of the World (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t213     Buddhism (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t215     Hinduism (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t217     Taoism (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t223     Religion in North America (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t240     Asian Religions (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t246     Islamic Religious Traditions (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t250     African Religions (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t252     African-American Religion (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t254     Native American Religion (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t256     Religion in Latin America (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t301     Jewish Spirituality and Mysticism (3 hours lecture)");
        GLOBAL_RELIGIOUS_TRADITIONS.add("RELG\t350     Selected Study in World Religions (3 hours lecture)");

        List<String> SEMINAR = new ArrayList<>();
        SEMINAR.add("RELG\t460     Seminar in World Religions (3 hours seminar)");
        SEMINAR.add("RELG\t462     Seminar in Religious Texts (3 hours seminar)");
        SEMINAR.add("RELG\t465     Seminar in Religion and Culture (3 hours seminar)");
        SEMINAR.add("RELG\t467     Seminar in Religious Issues (3 hours seminar)");

        Major_Religion_Details.put("TEXTS | Complete 2 courses from the following:",TEXTS);
        Major_Religion_Details.put("ISSUES | Complete 2 courses from the following:",ISSUES);
        Major_Religion_Details.put("APPROACHES | Complete 2 courses from the following:",APPROACHES);
        Major_Religion_Details.put("GLOBAL RELIGIOUS TRADITIONS",GLOBAL_RELIGIOUS_TRADITIONS);
        Major_Religion_Details.put("SEMINAR | Complete 1 course from the following:",SEMINAR);

        return Major_Religion_Details;
    }
}
