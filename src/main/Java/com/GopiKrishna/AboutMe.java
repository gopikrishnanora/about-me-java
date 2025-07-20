public class AboutMe {

    public static void main(String[] args) {
        printHeader();
        printTechnologies();
        printExperience();
    }

    private static void printHeader() {
        System.out.println("👋 Hello, I'm GopiKrishna");
        System.out.println("🌐 Cloud & DevOps Engineer | SRE | CI/CD | Kubernetes | Terraform");
        System.out.println("--------------------------------------------------------------\n");
    }

    private static void printTechnologies() {
        System.out.println("💡 Technologies & Tools:");
        String[] tools = {
            "Cloud: GCP, Azure, AWS",
            "IaC: Terraform, ARM Templates, CloudFormation",
            "CI/CD: GitHub Actions, Azure DevOps, Jenkins, GitLab CI",
            "Containers: Docker, Kubernetes (GKE, AKS)",
            "Monitoring: Prometheus, Grafana, ELK, Azure Monitor",
            "Scripting: Bash, Python, YAML",
            "Security: IAM, VPC, RBAC, SSL, Key Vault"
        };
        for (String tool : tools) {
            System.out.println(" - " + tool);
        }
        System.out.println();
    }

    private static void printExperience() {
        System.out.println("📌 Employment History:");

        System.out.println("\n🔹 Cloud & DevOps Engineer – HCL Technologies (2022 – Present)");
        System.out.println("   - Led GCP and Azure cloud infrastructure setup and migration.");
        System.out.println("   - Designed secure CI/CD pipelines for microservices.");
        System.out.println("   - Managed GKE clusters and Kubernetes manifests.");

        System.out.println("\n🔹 DevOps Engineer – Wipro (2019 – 2022)");
        System.out.println("   - Built infrastructure using Terraform and Ansible.");
        System.out.println("   - Implemented monitoring/logging using Prometheus, ELK stack.");
        System.out.println("   - Automated deployment and release pipelines with Jenkins.");

        System.out.println("\n🔹 System Admin – Data Glove (2017 – 2019)");
        System.out.println("   - Maintained Linux servers, performed patching and backups.");
        System.out.println("   - Started with basic scripting and automation.");
    }
}
