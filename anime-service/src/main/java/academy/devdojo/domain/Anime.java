package academy.devdojo.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Anime {

    Long id;
    String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> getAnimes() {

        Anime ninjaKamui = new Anime(1L, "Ninja Kamui");
        Anime kaijuu = new Anime(2L, "Kaijuu-8gou");
        Anime kimetsuNoYaiba = new Anime(3L, "Kimetsu No Yaiba");

        return List.of(ninjaKamui, kaijuu, kimetsuNoYaiba);
    }
}
