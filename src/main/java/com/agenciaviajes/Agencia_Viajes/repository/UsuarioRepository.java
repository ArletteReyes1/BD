package com.agenciaviajes.Agencia_Viajes.repository;

import java.util.Optional;
import com.agenciaviajes.Agencia_Viajes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String correo); //springboot hace la busqueda por el email
}
