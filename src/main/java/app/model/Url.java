package app.model;

import javax.persistence.*;

/**
 * Created by yurii on 10.09.17.
 */
@Entity(name = "urls")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "url_id")
    private int id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(nullable = false)
    private int monitoringPeriod;

    @Column(nullable = false)
    private int serverResponseTime;

    @Column(nullable = false)
    private String expectedHTTPResponseCode;

    @Column(nullable = false)
    private long minSizeOfTheResponse;

    @Column(nullable = false)
    private long maxSizeOfTheResponse;

    public Url(String url, int monitoringPeriod, int serverResponseTime, String expectedHTTPResponseCode, long minSizeOfTheResponse, long maxSizeOfTheResponse) {
        this.url = url;
        this.monitoringPeriod = monitoringPeriod;
        this.serverResponseTime = serverResponseTime;
        this.expectedHTTPResponseCode = expectedHTTPResponseCode;
        this.minSizeOfTheResponse = minSizeOfTheResponse;
        this.maxSizeOfTheResponse = maxSizeOfTheResponse;
    }

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

    @Override
    public String toString() {
        return "Url{" +
                "url='" + url + '\'' +
                ", monitoringPeriod=" + monitoringPeriod +
                ", serverResponseTime=" + serverResponseTime +
                ", expectedHTTPResponseCode='" + expectedHTTPResponseCode + '\'' +
                ", minSizeOfTheResponse=" + minSizeOfTheResponse +
                ", maxSizeOfTheResponse=" + maxSizeOfTheResponse +
                '}';
    }
}

