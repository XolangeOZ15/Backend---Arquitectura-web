package pe.edu.upc.EduPack_Solutions_sem3.servicesimplements;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem3.entities.Pedido;
import pe.edu.upc.EduPack_Solutions_sem3.repositories.IPedidoRepository;
import pe.edu.upc.EduPack_Solutions_sem3.servicesinterfaces.IPedidoService;
@Service
public class PedidoServiceImplement implements IPedidoService {
	@Autowired
	private IPedidoRepository pR;

	@Override
	public void insert(Pedido pedido) {
		pR.save(pedido);
	}

	@Override
	public List<Pedido> list() {
		return pR.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pR.deleteById(id);
	}

	@Override
	public Pedido listId(int id) {
		// TODO Auto-generated method stub
		return pR.findById(id).orElse(new Pedido());
	}

	@Override
	public List<Pedido> findByNombrePedido(String name) {
		// TODO Auto-generated method stub
		return pR.findByNombrePedido(name);
	}

	
	
	
	
}
