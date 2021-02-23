package xyz.morlotti.virtualbookcase.batch.beans;

import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements java.io.Serializable
{
    private Integer id;

    private String localId;

    private BookDescription bookDescription;

    private String condition;

    private boolean available;

    private Date created;

    ////////

    private List<Loan> loans;
}