package ApiEstudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;

import javax.validation.Valid;
import java.util.List;

class Documento {
    private String data;
    private double ph;
    private double tds;
    private double temp;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public double getTds() {
        return tds;
    }

    public void setTds(double tds) {
        this.tds = tds;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}

@RestController
@RequestMapping("/documentos") // define a rota base
public class DocumentoController {

    @Autowired
    private MongoTemplate mongoTemplate; // aplica o uso do mongo db

    @GetMapping
    public List<Documento> lerDocumentos() {  // pega tudo dessa collection
        return mongoTemplate.findAll(Documento.class, "aquacollections");
    }

    @PostMapping
    public String inserirDocumentos(@Valid @RequestBody Documento documento) {
        mongoTemplate.save(documento, "aquacollections");
        return "Documento inserido com sucesso!";
    }

    @GetMapping("/ultimo")
    public Documento lerUltimoDocumento() {
        Query query = new Query();
        query.with(org.springframework.data.domain.Sort.by(org.springframework.data.domain.Sort.Direction.DESC, "_id"));
        query.limit(1);

        return mongoTemplate.findOne(query, Documento.class, "aquacollections");
    }
}
