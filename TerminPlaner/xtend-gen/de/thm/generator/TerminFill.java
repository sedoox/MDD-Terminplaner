package de.thm.generator;

import Terminplaner.impl.TerminImpl;
import java.util.Date;

@SuppressWarnings("all")
public class TerminFill extends TerminImpl {
  private Date startDatum = null;
  
  public TerminFill(final Date startDatum, final int order) {
    this.startDatum = startDatum;
    this.order = order;
  }
  
  public Date getStartDatum() {
    return this.startDatum;
  }
  
  public String toString() {
    return "MeetingFill";
  }
}
