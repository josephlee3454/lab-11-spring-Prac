package com.Songr2.Songr2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;


@Controller
public class AlbumController {

    @GetMapping("/hello-world")
    public String showHelloPage(){
        return "hello-world-page.html";
    }

    @GetMapping("/")
    public String ShowSplash(){return "splash.html";}

    @GetMapping("/albums")
    public String viewAlbums (Model m){
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("No Need to Argue","cranberries",12,"3","http://3.bp.blogspot.com/-C7YwgREqx4o/TrggVVRdLNI/AAAAAAAAAbE/PwxI-3RYqb0/s1600/The_Cranberries+fashion.jpg"));
        albums.add(new Album("Final Straw","Snow Patrol",9,"3","https://rhodesmedia.com/wp-content/uploads/2020/11/snow-ad.jpg"));
        albums.add(new Album("The Detour","Ekoh",12,"5","https://www.reviewjournal.com/wp-content/uploads/2018/08/11004041_web1_copy_image1.jpeg"));
        m.addAttribute("albumList",albums);
        return "albums";
    }

    @GetMapping("/capitalize/{var}")
    public String capitalize (
            Model m,
            @PathVariable String var
    ) {

        System.out.println(var.toUpperCase());
        m.addAttribute("uppercase",var.toUpperCase());

        return "capitalize";
    }




}



