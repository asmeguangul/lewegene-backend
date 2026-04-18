package com.lewegene.lewegenebackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    @GetMapping
    public List<CampaignResponse> getCampaigns() {
        return List.of(
                new CampaignResponse(
                        1L,
                        "Help a family rebuild their future",
                        "Medical Support",
                        2500.0,
                        10000.0,
                        "https://images.unsplash.com/photo-1516574187841-cb9cc2ca948b?q=80&w=1200&auto=format&fit=crop",
                        true
                ),
                new CampaignResponse(
                        2L,
                        "Support school supplies for children",
                        "Education",
                        4200.0,
                        12000.0,
                        "https://images.unsplash.com/photo-1509062522246-3755977927d7?q=80&w=1200&auto=format&fit=crop",
                        false
                ),
                new CampaignResponse(
                        3L,
                        "Emergency housing support for mother and child",
                        "Emergency",
                        6100.0,
                        15000.0,
                        "https://images.unsplash.com/photo-1529156069898-49953e39b3ac?q=80&w=1200&auto=format&fit=crop",
                        true
                ),
                new CampaignResponse(
                        4L,
                        "Community fundraiser for local clinic",
                        "Community",
                        3100.0,
                        9000.0,
                        "https://images.unsplash.com/photo-1519389950473-47ba0277781c?q=80&w=1200&auto=format&fit=crop",
                        false
                )
        );
    }
}