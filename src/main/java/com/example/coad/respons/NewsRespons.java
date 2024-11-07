package com.example.coad.respons;


import lombok.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ResponseBody

public class NewsRespons {
    private String status;
    private int totalResults;
    private List<Articles> articles;
}
