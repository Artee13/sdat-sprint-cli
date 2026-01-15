package com.keyin.sdat.cli;

public class ReportService {
    private final HttpGetter http;

    public ReportService(HttpGetter http) {
        this.http = http;
    }

    public String airportsByCity() throws Exception {
        return http.get("/reports/airports-by-city");
    }

    public String aircraftByPassenger() throws Exception {
        return http.get("/reports/aircraft-by-passenger");
    }

    public String airportsByAircraft() throws Exception {
        return http.get("/reports/airports-by-aircraft");
    }

    public String airportsUsedByPassenger() throws Exception {
        return http.get("/reports/airports-used-by-passenger");
    }
}
