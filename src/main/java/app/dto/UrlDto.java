package app.dto;

/**
 * Created by yurii on 18.09.17.
 */
public class UrlDto {

    private String url;
    private int monitoringPeriod;
    private int serverResponseTime;
    private String expectedHTTPResponseCode;
    private long minSizeOfTheResponse;
    private long maxSizeOfTheResponse;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMonitoringPeriod() {
        return monitoringPeriod;
    }

    public void setMonitoringPeriod(int monitoringPeriod) {
        this.monitoringPeriod = monitoringPeriod;
    }

    public int getServerResponseTime() {
        return serverResponseTime;
    }

    public void setServerResponseTime(int serverResponseTime) {
        this.serverResponseTime = serverResponseTime;
    }

    public String getExpectedHTTPResponseCode() {
        return expectedHTTPResponseCode;
    }

    public void setExpectedHTTPResponseCode(String expectedHTTPResponseCode) {
        this.expectedHTTPResponseCode = expectedHTTPResponseCode;
    }

    public long getMinSizeOfTheResponse() {
        return minSizeOfTheResponse;
    }

    public void setMinSizeOfTheResponse(long minSizeOfTheResponse) {
        this.minSizeOfTheResponse = minSizeOfTheResponse;
    }

    public long getMaxSizeOfTheResponse() {
        return maxSizeOfTheResponse;
    }

    public void setMaxSizeOfTheResponse(long maxSizeOfTheResponse) {
        this.maxSizeOfTheResponse = maxSizeOfTheResponse;
    }
}
