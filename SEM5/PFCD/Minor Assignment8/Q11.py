def price_per_unit(weight_file, price_file, output_file):
    with open(weight_file) as wf, open(price_file) as pf, open(output_file, 'w') as out:
        for w, p in zip(wf, pf):
            w, p = float(w.strip()), float(p.strip())
            out.write(str(p / w) + "\n")
