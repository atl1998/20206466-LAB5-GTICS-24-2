package com.example.lab5_20206466.controller;
import com.example.lab5_20206466.entity.*;
import com.example.lab5_20206466.repository.*;
import com.example.lab5_20206466.controller.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("/admin")
public class adminController {
    final MascotaRepository mascotaRepository;
    final ViajeRepository viajeRepository;
    public adminController(MascotaRepository mascotaRepository,ViajeRepository viajeRepository) {
        this.mascotaRepository = mascotaRepository;
        this.viajeRepository = viajeRepository;
    }
    @GetMapping("")
    public String vistaPrincipal(Model model) {
        return "paginaprincipal";
    }
    @GetMapping("/listmascotas")
    public String listarMascotas(Model model) {
        List<Mascota> lista = mascotaRepository.findAll();
        model.addAttribute("listamascotas", lista);
        return "lista_mascotas";
    }
    @GetMapping("/listviajes")
    public String listarViajes(Model model) {
        List<Viaje> lista = viajeRepository.findAll();
        model.addAttribute("listaviajes", lista);
        return "lista_viajes";
    }
}
