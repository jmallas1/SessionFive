package us.jmallas1.enums.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.jmallas1.enums.Teams;

import static org.junit.jupiter.api.Assertions.*;

class TeamsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void validateEnum()
    {
        assertEquals("Dallas Cowboys", Teams.DAL.toString(), "Dallas Cowboys");
        assertEquals("New York Giants", Teams.NYG.toString(), "New York Giants");
        assertEquals("Philadelphia Eagles", Teams.PHI.toString(), "Philadelphia Eagles");
        assertEquals("Washington Redskins", Teams.WAS.toString(), "Washington Redskins");
        assertEquals("Chicago Bears", Teams.CHI.toString(), "Chicago Bears");
        assertEquals("Detroit Lions", Teams.DET.toString(), "Detroit Lions");
        assertEquals("Green Bay Packers", Teams.GBP.toString(), "Green Bay Packers");
        assertEquals("Minnesota Vikings", Teams.MIN.toString(), "Minnesota Vikings");
        assertEquals("Atlanta Falcons", Teams.ATL.toString(), "Atlanta Falcons");
        assertEquals("Carolina Panthers", Teams.CAR.toString(), "Carolina Panthers");
        assertEquals("New Orleans Saints", Teams.NOS.toString(), "New Orleans Saints");
        assertEquals("Tampa Bay Buccaneers", Teams.TBB.toString(), "Tampa Bay Buccaneers");
        assertEquals("Arizona Cardinals", Teams.AZI.toString(), "Arizona Cardinals");
        assertEquals("Los Angeles Rams", Teams.LAR.toString(), "Los Angeles Rams");
        assertEquals("San Francisco 49ers", Teams.SFO.toString(), "San Francisco 49ers");
        assertEquals("Seattle Seahawks", Teams.SEA.toString(), "Seattle Seahawks");
    }
}