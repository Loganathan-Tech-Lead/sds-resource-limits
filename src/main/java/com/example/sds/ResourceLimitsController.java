package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Resource limits" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class ResourceLimitsController {
    @GetMapping("/demo/resource-limits")
    public Map<String, String> demo() {
        return Map.of("concept", "Resource limits", "status", "scaffold - implement me");
    }
}
