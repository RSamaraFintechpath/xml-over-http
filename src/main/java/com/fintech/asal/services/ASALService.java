package com.fintech.asal.services;

import org.springframework.stereotype.Service;
import com.fintech.asal.dtos.Note;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;


@Service
public class ASALService {


    public void marshal(Note jsonNote) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Note.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

//        Set<ConstraintViolation<Note>> violations = validator.validate(jsonNote);

        jaxbMarshaller.marshal(jsonNote, System.out);
    }

public Note unmarshalFromURL() throws JAXBException, MalformedURLException {
    JAXBContext jaxbContext = JAXBContext.newInstance(Note.class);
    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    URL url=new URL("https://www.w3schools.com/xml/note.xml");
    Note note=(Note) jaxbUnmarshaller.unmarshal(url);
    return note;

}

}
