# 54. Resource limits

**Category:** Platform  |  **Status:** Scaffold - implement the TODOs

Requests/limits, OOMKilled, MaxRAMPercentage.

## Sequence
```mermaid
sequenceDiagram
    participant Kubelet
    participant Pod
    participant Node
    Kubelet->>Pod: start limits 1Gi
    Pod->>Node: memory climbs
    Node->>Pod: OOMKilled 137
```

## Run
```bash
# no infrastructure needed
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
