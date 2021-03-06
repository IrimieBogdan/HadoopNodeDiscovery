package dto;

/**
 * LiveNode with name and LiveNodeDetails.
 */
public class LiveNode {
    private String nodeName;
    private LiveNodeDetails liveNodeDetails;

    public LiveNode(String nodeName, LiveNodeDetails liveNodeDetails) {
        this.nodeName = nodeName;
        this.liveNodeDetails = liveNodeDetails;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public LiveNodeDetails getLiveNodeDetails() {
        return liveNodeDetails;
    }

    public void setLiveNodeDetails(LiveNodeDetails liveNodeDetails) {
        this.liveNodeDetails = liveNodeDetails;
    }

    @Override
    public String toString() {
        return nodeName + " " + liveNodeDetails.getInfoAddr() + "\n";
    }
}
