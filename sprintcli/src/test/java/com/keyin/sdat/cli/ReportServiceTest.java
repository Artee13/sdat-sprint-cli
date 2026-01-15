package com.keyin.sdat.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ReportServiceTest {

    @Test
    public void airportsByCity_callsCorrectEndpoint() throws Exception {
        HttpGetter http = mock(HttpGetter.class);
        when(http.get("/reports/airports-by-city")).thenReturn("CITY_RESULT");

        ReportService service = new ReportService(http);
        String result = service.airportsByCity();

        assertEquals("CITY_RESULT", result);
        verify(http, times(1)).get("/reports/airports-by-city");
    }

    @Test
    public void aircraftByPassenger_callsCorrectEndpoint() throws Exception {
        HttpGetter http = mock(HttpGetter.class);
        when(http.get("/reports/aircraft-by-passenger")).thenReturn("PASSENGER_RESULT");

        ReportService service = new ReportService(http);
        String result = service.aircraftByPassenger();

        assertEquals("PASSENGER_RESULT", result);
        verify(http, times(1)).get("/reports/aircraft-by-passenger");
    }

    @Test
    public void airportsByAircraft_callsCorrectEndpoint() throws Exception {
        HttpGetter http = mock(HttpGetter.class);
        when(http.get("/reports/airports-by-aircraft")).thenReturn("AIRCRAFT_RESULT");

        ReportService service = new ReportService(http);
        String result = service.airportsByAircraft();

        assertEquals("AIRCRAFT_RESULT", result);
        verify(http, times(1)).get("/reports/airports-by-aircraft");
    }

    @Test
    public void airportsUsedByPassenger_callsCorrectEndpoint() throws Exception {
        HttpGetter http = mock(HttpGetter.class);
        when(http.get("/reports/airports-used-by-passenger")).thenReturn("USED_RESULT");

        ReportService service = new ReportService(http);
        String result = service.airportsUsedByPassenger();

        assertEquals("USED_RESULT", result);
        verify(http, times(1)).get("/reports/airports-used-by-passenger");
    }
}
