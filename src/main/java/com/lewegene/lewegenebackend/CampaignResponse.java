package com.lewegene.lewegenebackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampaignResponse {
    private Long id;
    private String title;
    private String category;
    private Double raised;
    private Double goal;
    private String imageUrl;
    private boolean urgent;
}